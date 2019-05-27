package com.isep.miga.model;

import javax.validation.constraints.NotBlank;
import javax.persistence.*;

@Entity
@Table(name = "vote")
public class Vote {
    @Id
    @GeneratedValue
    private int vote_id;
    @NotBlank
    private int id_user;
    @NotBlank
    private int id_reclam;


    public Vote(int vote_id, int id_user, int id_reclam) {
        super();
        this.vote_id = vote_id;
        this.id_user = id_user;
        this.id_reclam = id_reclam;
    }

    public int getVote_id() {
        return vote_id;
    }

    public void setVote_id(int vote_id) {
        this.vote_id = vote_id;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getId_reclam() {
        return id_reclam;
    }

    public void setId_reclam(int id_reclam) {
        this.id_reclam = id_reclam;
    }
}

