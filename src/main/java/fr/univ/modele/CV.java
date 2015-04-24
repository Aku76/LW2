package fr.univ.modele;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name="cv")
public class CV {

    private String name;
    private String firstName;
    private String objectif;
    private int age;
    /*private List<String> experiencePro;
    /*private List<String> scolarity;
    private List<Langue> langues;
    private List<CompetenceInfo> competenceInfos;*/

    public CV(String name, String firstName, String objectif, int age/*, List<String> experiencePro/*, List<String> scolarity,
              List<Langue> langues, List<CompetenceInfo> competenceInfos*/) {
        this.name = name;
        this.firstName = firstName;
        this.objectif = objectif;
        this.age = age;
        /*this.experiencePro = experiencePro;
        /*this.scolarity = scolarity;
        this.langues = langues;
        this.competenceInfos = competenceInfos;*/
    }

    public CV(){}

    public String getName() {
        return name;
    }
    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }
    @XmlElement
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getObjectif() {
        return objectif;
    }
    @XmlElement
    public void setObjectif(String objectif) {
        this.objectif = objectif;
    }

    public int getAge() {
        return age;
    }
    @XmlElement
    public void setAge(int age) {
        this.age = age;
    }
/*
    public List<String> getExperiencePro() {
        return experiencePro;
    }
    @XmlElement
    public void setExperiencePro(List<String> experiencePro) {
        this.experiencePro = experiencePro;
    }

    public List<String> getScolarity() {
        return scolarity;
    }
    @XmlElement
    public void setScolarity(List<String> scolarity) {
        this.scolarity = scolarity;
    }

    public List<Langue> getLangues() {
        return langues;
    }
    @XmlElement
    public void setLangues(List<Langue> langues) {
        this.langues = langues;
    }

    public List<CompetenceInfo> getCompetenceInfos() {
        return competenceInfos;
    }
    @XmlElement
    public void setCompetenceInfos(List<CompetenceInfo> competenceInfos) {
        this.competenceInfos = competenceInfos;
    }*/
}
