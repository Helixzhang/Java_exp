package exp4;

public class exp4_1 {
    public static class Clinic{
        private static int count = 0 ;
        private String name;
        public class Doctor{
            private final String id, name;
            public Doctor(String id,String doctor_name,String Clinic_name){
                this.id = id;
                this.name = doctor_name;
                Clinic.this.name = Clinic_name;
                count++;
            }
            public void output(){
                System.out.println("第"+count+"个医生：");
                System.out.println("编号是"+id+",名字是"+name+",诊所名是"+Clinic.this.name);
            }
        }

    }

    public static void main(String[] args) {
        Clinic.Doctor d1 = new Clinic().new Doctor("001","张三","健康诊所");
        d1.output();
        Clinic.Doctor d2 = new Clinic().new Doctor("002","李四","健康诊所");
        d2.output();
    }

}
