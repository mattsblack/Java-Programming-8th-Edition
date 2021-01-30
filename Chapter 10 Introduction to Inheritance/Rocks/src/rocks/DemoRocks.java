package rocks;

import javax.swing.JOptionPane;

public class DemoRocks {
	public static void main(String[] args) {
        IgneousRock igneousRock;
        MetamorphicRock metamorphicRock;
        SedimentaryRock sedimentaryRock;
        int sampleNumber1, sampleNumber2, sampleNumber3;
        int weight1, weight2, weight3;
        sampleNumber1 = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Please enter the sample number for the igneous rock"));
        weight1 = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Please enter the weight for the igneous rock"));
        sampleNumber2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Please enter the sample number for the metamorphic rock"));
        weight2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Please enter the weight for the metamorphic rock"));
        sampleNumber3 = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Please enter the sample number for the sedimentary rock"));
        weight3 = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Please enter the weight for the sedimentary rock"));
        igneousRock = new IgneousRock(sampleNumber1, weight1);
        metamorphicRock = new MetamorphicRock(sampleNumber2, weight2);
        sedimentaryRock = new SedimentaryRock(sampleNumber3, weight3);
        displayAll(igneousRock, metamorphicRock, sedimentaryRock);
    }
    public static void displayAll(IgneousRock igneousRock,
            MetamorphicRock metamorphicRock,
            SedimentaryRock sedimentaryRock){
        System.out.println("The data for the igneous rock is: "
                +igneousRock.getSampleNumber()+" "
                +igneousRock.getWeight()+" "
                +igneousRock.getDescription()
                +"\n"
                +"The data for the metamorphic rock is: "
                +metamorphicRock.getSampleNumber()+" "
                +metamorphicRock.getWeight()+" "
                +metamorphicRock.getDescription()
                +"\n"
                +"The data for the sedimentary rock is: "
                +sedimentaryRock.getSampleNumber()+" "
                +sedimentaryRock.getWeight()+" "
                +sedimentaryRock.getDescription());
    }
}
