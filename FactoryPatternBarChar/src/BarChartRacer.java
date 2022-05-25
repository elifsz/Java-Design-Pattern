
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

public class BarChartRacer {

    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
        File myCities = new File("cities.txt");
        Scanner in = new Scanner(myCities);
        int k = 12;

        String title = in.nextLine();
        String xAxis = in.nextLine();
        String source = in.nextLine();
        String[] data;
        String entry;

        BarChart chart = new BarChart(title, xAxis, source);

        StdDraw.enableDoubleBuffering();
        StdDraw.setCanvasSize(1000, 700);

        DefaultBarFeatureFactory df = new DefaultBarFeatureFactory();
        ModifiedBarFeatureFactory mf = new ModifiedBarFeatureFactory();

        JPanel panel = new JPanel();
        JRadioButton defaultButton = new JRadioButton("Default");
        JRadioButton modifiedButton = new JRadioButton("Modified");
        panel.add(defaultButton);
        panel.add(modifiedButton);

        ButtonGroup group = new ButtonGroup();
        group.add(defaultButton);
        group.add(modifiedButton);
        JOptionPane.showMessageDialog(null, panel, "Please Select Bar Type", JOptionPane.QUESTION_MESSAGE);

        if (modifiedButton.isSelected()) {
            Bar.setBarFactory(mf);
        } else {
            Bar.setBarFactory(df);
        }

        while (in.hasNextLine()) {

            in.nextLine();
            int n = Integer.parseInt(in.nextLine());

            // create array of bars using data and sort them
            Bar[] bars = new Bar[n];

            for (int i = 0; i < n; i++) {

                entry = in.nextLine();
                data = entry.split(",");
                bars[i] = new Bar(data[1], data[2], Integer.parseInt(data[3]), data[4]);

                chart.setCaption(data[0]);
            }
            Arrays.sort(bars, Comparator.reverseOrder());

            // add the bars to the bar chart
            for (int i = 0; i < k; i++) {
                String name = bars[i].getName();
                int value = bars[i].getValue();
                String category = bars[i].getCategory();
                String countryName = bars[i].getCountryName();

                String font = bars[i].getFont();
                if (countryName.charAt(0) == 'I') {
                    char[] countryChar = countryName.toCharArray();
                    countryChar[0] = 'İ';
                    countryName = String.valueOf(countryChar);
                }
                String image = bars[i].getImage(countryName.toLowerCase());

                chart.add(name, value, category);
                chart.factoryAdd(font, image);
            }

            // draw the bar chart
            StdDraw.clear();
            chart.draw();
            StdDraw.show();
            StdDraw.pause(1);
            chart.reset();
        }
    }
}
