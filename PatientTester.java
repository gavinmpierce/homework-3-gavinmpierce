
public class PatientTester {
    public static void main(){
        PatientManager blablabla = new PatientManager();
        System.out.println(blablabla.toString());

        for(int i = 0;i < 4; i++){
            Patient dummy = new Patient(i,200*i);
            blablabla.putPatient(dummy);
        }
        System.out.println(blablabla.toString());

        blablabla.caffeineAbsorbtion();
        blablabla.caffeineAbsorbtion();

        System.out.println(blablabla.toString());

        blablabla.removePatient(3);

        System.out.println(blablabla.toString());
    }
}
