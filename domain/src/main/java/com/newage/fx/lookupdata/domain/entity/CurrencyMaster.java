package com.newage.fx.lookupdata.domain.entity;


import com.newage.fx.lookupdata.domain.enums.LovStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Getter
@Setter
@Table(name = "efs_currency_master", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"code"}, name = "UK_CURRENCY_CODE"),
        @UniqueConstraint(columnNames = {"name"}, name = "UK_CURRENCY_NAME")})
public class CurrencyMaster extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Size(min = 2, max = 3)
    @Column(name = "code", nullable = false, length = 3)
    private String code;

    @NotNull
    @Size(min = 2, max = 100)
    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "symbol", length = 10)
    private String symbol;

    @NotNull
    @OneToOne
    @JoinColumn(name = "country_id", foreignKey = @ForeignKey(name = "FK_CURRENCY_COUNTRY_ID"))
    CountryMaster country;

    @NotNull(message = "Accepted Values (Active, Disabled, Inactive)")
    @Column(name = "status", nullable = false, length = 10)
    @Enumerated(EnumType.STRING)
    LovStatus status;

    @Version
    @Column(name = "version")
    Long version;

}
