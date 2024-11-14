    package ExameØvelse;

    public class Ex3 {
        public static void main(String[] args) {
            BMI t = new BMI();
            t.setHoejde(50.555);
            t.setVaegt(4.111);
            System.out.println(t.Calc_BMI());

        }
    }
    class BMI{
        double vaegt;//kg
        double hoejde; //cm
        double _BMI;
        boolean isUnderWeight=false;
        boolean isOverWeight=false;
        boolean isNormalWeight=false;
        double bmi;
        BMI(){
            this.vaegt =0;
            this.hoejde =0;
            this._BMI=_BMI;
            this.bmi = 0;


        }

        public void setHoejde(double hoejde) {
            this.hoejde = hoejde;
        }

        public void setVaegt(double vaegt) {
            this.vaegt = vaegt;
        }

        public double get_BMI() {
            return _BMI;
        }

        public double Calc_BMI() {
            if (hoejde > 0 && vaegt > 0) {
                double heightInMeters = hoejde / 100; // Convert cm to meters
                bmi = vaegt / (heightInMeters * heightInMeters);
            } else {
                System.out.println("Invalid height or weight");
            }
            return bmi;
        }
    }
