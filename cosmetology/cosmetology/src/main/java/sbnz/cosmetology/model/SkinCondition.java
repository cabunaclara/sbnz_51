package sbnz.cosmetology.model;

import javax.persistence.*;

@Entity
public class SkinCondition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column
    private boolean wrinkles;

    @Column
    private boolean dryness;

    @Column
    private boolean reactive;

    @Column
    private boolean problematic;

    @Column
    @Enumerated(EnumType.STRING)
    private SkinConditionEnum skinConditionEnum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isWrinkles() {
        return wrinkles;
    }

    public void setWrinkles(boolean wrinkles) {
        this.wrinkles = wrinkles;
    }

    public boolean isDryness() {
        return dryness;
    }

    public void setDryness(boolean dryness) {
        this.dryness = dryness;
    }

    public boolean isReactive() {
        return reactive;
    }

    public void setReactive(boolean reactive) {
        this.reactive = reactive;
    }

    public boolean isProblematic() {
        return problematic;
    }

    public void setProblematic(boolean problematic) {
        this.problematic = problematic;
    }

    public SkinConditionEnum getSkinConditionEnum() {
        return skinConditionEnum;
    }

    public void setSkinConditionEnum(SkinConditionEnum skinConditionEnum) {
        this.skinConditionEnum = skinConditionEnum;
    }

    public SkinCondition() {
    }

    public SkinCondition(boolean wrinkles, boolean dryness, boolean reactive, boolean problematic, SkinConditionEnum skinConditionEnum) {
        this.wrinkles = wrinkles;
        this.dryness = dryness;
        this.reactive = reactive;
        this.problematic = problematic;
        this.skinConditionEnum = skinConditionEnum;
    }
}
