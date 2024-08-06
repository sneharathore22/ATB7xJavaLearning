package ex_0408;

public class Lab153 {

    public static void main(String[] args) {

        //Class -Attribute/properties -data Types - primitive/non premitive
        //Class- Behaviour

        //object - real entity-class-
        //ClassName classRef =newClassName();

        //new ClassName();- object
        //classRef -class Ref
        //ClassName=Class Name which blueprint you are using

        BuildingBP dlfRef =new BuildingBP();
        dlfRef.name = "DLF Pvt Building";
        dlfRef.noOfrooms=100;

        dlfRef.useLift();



        BuildingBP prestigeRef =new BuildingBP();
        prestigeRef.name = "DLF Pvt Building";
        prestigeRef.noOfrooms=100;

        prestigeRef.useLift();

    }
}
