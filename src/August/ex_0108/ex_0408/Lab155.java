package August.ex_0108.ex_0408;

public class Lab155 {

    public static void main(String[] args) {

        //Class -Attribute/properties -data Types - primitive/non premitive
        //Class- Behaviour

        //object - real entity-class-
        //ClassName classRef =newClassName();

        //new ClassName();- object
        //classRef -class Ref
        //ClassName=Class Name which blueprint you are using

        BuildingBP dlf =new BuildingBP();
        dlf.name = "DLF Pvt Building";
        dlf.noOfrooms=100;

        dlf.useLift();



        BuildingBP prestigeRef =new BuildingBP();
        prestigeRef.name = "DLF Pvt Building";
        prestigeRef.noOfrooms=100;

        prestigeRef.useLift();

    }
}
