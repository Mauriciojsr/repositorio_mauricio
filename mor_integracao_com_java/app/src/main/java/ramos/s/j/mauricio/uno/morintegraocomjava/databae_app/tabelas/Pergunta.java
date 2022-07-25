package ramos.s.j.mauricio.uno.morintegraocomjava.databae_app.tabelas;

import static androidx.room.ForeignKey.CASCADE;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "tblPergunta"
        , indices = {@Index(value = "id", unique = true), @Index(value = "pergunta")}
        , foreignKeys = {@ForeignKey(entity = Prova.class, parentColumns = "id",
                childColumns = "prova_id", onUpdate = CASCADE, onDelete = CASCADE)})

public class Pergunta {
    @PrimaryKey(autoGenerate = true)

    private int id, prova_id;
    private String pergunta;

    public Pergunta() {}

    //Construtor de cópia
    public Pergunta(Pergunta tblPergunta){
        this.id       = tblPergunta.getId();
        this.prova_id = tblPergunta.getProva_id();
        this.pergunta = tblPergunta.getPergunta();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProva_id() {
        return prova_id;
    }

    public void setProva_id(int prova_id) {
        this.prova_id = prova_id;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }
}
