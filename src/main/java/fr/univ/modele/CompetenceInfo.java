package fr.univ.modele;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by AffluxXx on 24/04/2015.
 */
@XmlRootElement(name="competenceInfo")
public class CompetenceInfo {

    private String name;
    private int level;

    public CompetenceInfo(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }
    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }
    @XmlElement
    public void setLevel(int level) {
        this.level = level;
    }}
