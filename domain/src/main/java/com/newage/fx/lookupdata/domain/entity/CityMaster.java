package com.newage.fx.lookupdata.domain.entity;


import com.newage.fx.lookupdata.domain.enums.LovStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@Table(name = "efs_city_master",
        uniqueConstraints =
                {@UniqueConstraint(columnNames = {"id", "state_id", "country_id"}, name = "UK_COUNTRY_STATE_CITY")}
)
public class CityMaster extends Auditable<String> {

    /*Auto Generation Id*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    /*City Name*/
    @NotNull
    @NotEmpty
    @Column(name = "name", nullable = false, length = 100)
    String name;

    /*Country Id*/
    @NotNull
    @ManyToOne
    @JoinColumn(name = "country_id", foreignKey  = @ForeignKey(name = "FK_CITY_COUNTRY_ID"))
    CountryMaster country;

    /*state Id*/
    @NotNull
    @ManyToOne
    @JoinColumn(name = "state_id", foreignKey = @ForeignKey(name = "FK_CITY_STATE_ID"))
    StateMaster state;

    /* Lov Status */
    @NotNull(message = "Accepted Values (Active, Block, Hide)")
    @Column(name = "status", nullable = false, length = 10)
    @Enumerated(EnumType.STRING)
    LovStatus status;

    @Version
    @Column(name = "version")
    Long version;

}