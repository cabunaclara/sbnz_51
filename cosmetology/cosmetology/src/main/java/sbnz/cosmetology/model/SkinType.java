package sbnz.cosmetology.model;

import javax.persistence.*;

@Entity
public class SkinType {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean sebum;

    private boolean largePores;

    private boolean flaky;

    @Enumerated(EnumType.STRING)
    private SkinTypeEnum skinTypeEnum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isSebum() {
        return sebum;
    }

    public void setSebum(boolean sebum) {
        this.sebum = sebum;
    }

    public boolean isLargePores() {
        return largePores;
    }

    public void setLargePores(boolean largePores) {
        this.largePores = largePores;
    }

    public boolean isFlaky() {
        return flaky;
    }

    public void setFlaky(boolean flaky) {
        this.flaky = flaky;
    }

    public SkinTypeEnum getSkinTypeEnum() {
        return skinTypeEnum;
    }

    public void setSkinTypeEnum(SkinTypeEnum skinTypeEnum) {
        this.skinTypeEnum = skinTypeEnum;
    }

    public SkinType() {
    }

    public SkinType(boolean sebum, boolean largePores, boolean flaky, SkinTypeEnum skinTypeEnum) {
        this.sebum = sebum;
        this.largePores = largePores;
        this.flaky = flaky;
        this.skinTypeEnum = skinTypeEnum;
    }
}

