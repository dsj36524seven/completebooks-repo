public class Activity1_v2 {

    public static void main(String[] args) {
        if(args.length != 2) {
            System.err.println("Invalid number of arguments, two arguments required");
            System.exit(-1);
        }

        Integer systolic_BP = Integer.valueOf(args[0]);
        Integer diastolic_BP = Integer.valueOf(args[1]);

        if(systolic_BP < 90) {
            System.out.printf("LOW Systolic blood pressure - @ %s /", args[0]);
        } else if(systolic_BP > 89 && systolic_BP < 121) {
            System.out.printf("IDEAL Systolic blood pressure - @ %s /", args[0]);
        } else if(systolic_BP > 120 && systolic_BP < 141){
            System.out.printf("PRE-HIGH Systolic blood pressure - @ %s /", args[0]);
        } else {
            System.out.printf("HIGH Systolic blood pressure - @ %s / ", args[0]);
        }

        if(diastolic_BP < 60) {
            System.out.printf(" LOW Diastolic blood pressure - @ %s ", args[1]);

        } else if(diastolic_BP > 59 && diastolic_BP < 81) {
            System.out.printf(" IDEAL Diastolic blood pressure - @ %s ", args[1]);
        } else if(diastolic_BP > 80 && diastolic_BP < 91){
            System.out.printf(" PRE-HIGH Diastolic blood pressure - @ %s ", args[1]);
        } else {
            System.out.printf(" HIGH Diastolic blood pressure - @ %s ", args[1]);
        }
    }
}
