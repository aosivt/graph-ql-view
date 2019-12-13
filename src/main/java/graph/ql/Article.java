package graph.ql;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;

@Data
@EqualsAndHashCode
@Entity
@Table(schema = "cbo", name = "cbo_articles")
public class Article {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "external_str_id", nullable = false)
    private String id;
    protected String name1;
    protected String name2;
    protected String note;
    protected String ecrlongname;
    protected String ecrshortname;
    @Column(name = "has_mrc")
    protected Boolean hasMRC;

}
