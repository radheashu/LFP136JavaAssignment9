package Com.Brigedlab;

public class EmployeeWages {

        public static void main(String[] args) {
            int IS_PRESENT =1;

            int  eCheck = (int) Math.floor(Math.random() * 10) % 2; //0.0 -1.0

            //System.out.println(eCheck);

            if (eCheck == IS_PRESENT){
                System.out.println("Employee is Present");
            }
            else {
                System.out.println("Employee is Absent");
            }
        }
    }

