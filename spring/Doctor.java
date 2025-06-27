package demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Doctor implements Staff {
    @Override
    public String toString() {
        return "Doctor{" +
                "qualificaton='" + qualificaton + '\'' +
                '}';
    }

    public String getQualificaton() {
        return qualificaton;
    }

    public void setQualificaton(String qualificaton) {
        this.qualificaton = qualificaton;
    }

    private String qualificaton;


    public void assist(){
        System.out.println("Doctor is assisting");
    }
}
