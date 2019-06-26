package Quiz_3;

abstract class MijnAbstract {

    String str = "N";

    MijnAbstract() {
        this("0");
        str += "L";
    }
    MijnAbstract(String str) {
        this.str += str;
    }
}
//gemaakt door Noelle