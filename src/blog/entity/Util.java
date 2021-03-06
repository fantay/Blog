/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blog.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Laurent-LIM
 */
@Entity
public class Util implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    /* jointure vers Page.java */
    @OneToMany(mappedBy = "util")
    private List<Page> pages = new ArrayList<>();
    
    /* jointure vers Article.java */
    @OneToMany(mappedBy = "util")
    private List<Article> articles = new ArrayList<>();
    
    /* jointure vers Commentaire.java */
    @OneToMany(mappedBy = "util")
    private List<Commentaire> commentaires = new ArrayList<>();
    
    /* jointure vers Message.java par table intermédiaire */
    @ManyToMany
    private List<Util> utils = new ArrayList<>();
    
    /* jointure vers Message.java par One To many*/
    @OneToMany(mappedBy = "util2")
    private List<Message> messages = new ArrayList<>();
    
    /* jointure one to one vers Numerosecu.java */
    @OneToOne(mappedBy = "util")
    private NumeroSecu numerosecu;
    
    
    /*  getter & setter */
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Util)) {
            return false;
        }
        Util other = (Util) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BlogUtil.Util[ id=" + id + " ]";
    }
    
}
