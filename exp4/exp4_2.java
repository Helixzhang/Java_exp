package exp4;

public class exp4_2 {
    public static class Clinic{
        private static int count = 0;

        public Object add_doctor(String id, String Doctor_name,String Clinic_name){
            count++;
            class Doctor{
                public String toString(){
                    return "第"+count+"名医生:"+"\n"+"编号是"+id+",名字是"+Doctor_name+",诊所名是"+Clinic_name;
                }
            }
            return new Doctor();
        }
    }

    public static void main(String[] args) {
        Clinic clinic = new Clinic();
        Object d1 = clinic.add_doctor("001","张三","健康诊所");
        System.out.println(d1.toString());
        Object d2 = clinic.add_doctor("002","李四","健康诊所");
        System.out.println(d2.toString());
    }
}
