import java.util.ArrayList;
public class PatientManager {
    ArrayList<Patient> patientList;

    public PatientManager(){
        patientList = new ArrayList<>();
        for(int i = 0; i <10;i++){
            patientList.add(null);
        }
    }

    public int putPatient(Patient x){
        for(int i = 0; i <10;i++){
            if (patientList.get(i) == null){
                patientList.add(i,x);
                return i;
            }
        }
        return -1;
    }

    public Patient removePatient(int i){
        Patient x = patientList.get(i);
        patientList.set(i, null);
        return x;
    }
    
    public void caffeineAbsorbtion(){
        for(int i = 0; i <10;i++){
            if (patientList.get(i) != null){
                patientList.get(i).caffeine -= 160;
                if(patientList.get(i).caffeine < 0){
                    removePatient(i);
                }
            }
        }
    }
    public String toString(){
        String results = "";
        for(int i = 0; i <10;i++){
            if (patientList.get(i) != null){
                int x = patientList.get(i).ID;
                double y = patientList.get(i).caffeine;
                results = results + "ID: " + x + "; Caffeine: " + y +"\n";  
            }
            else{
                int counter = 0;
                for (int k = 0; k <10;k++){
                    if (patientList.get(k) == null){
                        counter+=1;
                    }
                }
                if (counter > 9){
                    return "Empty"; 
                }
            }   
        }
        return results;
    }
}
