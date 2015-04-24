package fr.univ.modele;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name="cvs")
public class CVList {

    private List<CV> cvEntries;

    public CVList() {
        this.cvEntries = new ArrayList<CV>();

        CV cv = new CV();

        cv.setAge(21);
        cv.setFirstName("Cauchois");
        cv.setName("Steeven");
        cv.setObjectif("Objectif");
        /*
        List<String> experiencePro = new ArrayList<String>();
        experiencePro.add("Leclerc Drive");
        experiencePro.add("Satge AFSSO");
        cv.setExperiencePro(experiencePro);

        /*List<CompetenceInfo> competenceInfos = new ArrayList<CompetenceInfo>();
        competenceInfos.add(new CompetenceInfo("C", 8));
        competenceInfos.add(new CompetenceInfo("JAVA", 9));
        competenceInfos.add(new CompetenceInfo("PHP", 10));
        cv.setCompetenceInfos(competenceInfos);


        List<String> scolarity = new ArrayList<String>();
        scolarity.add("Lycee");
        scolarity.add("UFR");
        cv.setScolarity(scolarity);

        List<Langue> langues = new ArrayList<Langue>();
        langues.add(new Langue("FR", 8));
        langues.add(new Langue("EN", 9));
        cv.setLangues(langues);*/

        this.cvEntries.add(cv);
    }

    public List<CV> getCvEntries() {
        return cvEntries;
    }
    public CV getCv(int i) {
        return cvEntries.get(i);
    }

    @XmlElement
    public void setCvEntries(List<CV> cvEntries) {
        this.cvEntries = cvEntries;
    }

    public int addCV(CV cv){
        this.cvEntries.add(cvEntries.size(),cv);
        return (cvEntries.size()-1);
    }

}
