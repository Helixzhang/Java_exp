package exp5;

public class exp5_2 {
    public static class Doctor{
        private final String id, name, address;
        public Doctor(String id,String name,String address){
            this.id = id;
            this.name = name;
            this.address = address;
        }

        public void show(){
            System.out.println("id = "+id);
            System.out.println("name = "+name);
            System.out.println("address = "+address);
        }
    }

    public static class SpecDoctor extends Doctor{
        private String Specialty;
        public SpecDoctor(String id, String name, String address, String specialty) {
            super(id, name, address);
            this.Specialty = specialty;
        }

        public void setSpecialty(String specialty) {
            this.Specialty = specialty;
        }

        @Override
        public void show() {
            System.out.println("以下显示专业医生信息");
            super.show();
            System.out.println("specialty = "+Specialty);
        }
    }

    public static class NonSpqecDoctor extends Doctor{
        public NonSpqecDoctor(String id, String name, String address) {
            super(id, name, address);
        }

        @Override
        public void show() {
            System.out.println("以下显示非专业医生信息");
            super.show();
        }
    }

    public static void main(String[] args) {
        NonSpqecDoctor nonSpqecDoctor = new NonSpqecDoctor("001","张三","仑头路健康诊所");
        SpecDoctor specDoctor = new SpecDoctor("002","李四","琵琶州路幸福诊所","内科");
        nonSpqecDoctor.show();
        specDoctor.show();
        System.out.println("修改专业信息后的结果：");
        specDoctor.setSpecialty("外科");
        specDoctor.show();
    }
}
