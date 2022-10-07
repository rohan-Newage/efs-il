package com.newage.fx.lookupdata.domain.entity;

import com.newage.fx.lookupdata.domain.enums.LovStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;


@Entity
@Getter
@Setter
@Table(name = "efs_region_master",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"code"}, name = "UK_REGION_CODE"),
                @UniqueConstraint(columnNames = {"name"}, name = "UK_REGION_NAME")}

)
public class RegionMaster extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 2, max = 3)
    @Column(name = "code", nullable = false, length = 2)
    private String code;

    @NotNull
    @Size(min = 2, max = 100)
    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @OneToMany(mappedBy = "region")
    private List<CountryMaster> countries;

    @NotNull(message = "Accepted Values (Active, Disabled, Inactive)")
    @Column(name = "status", nullable = false, length = 10)
    @Enumerated(EnumType.STRING)
    private LovStatus status;

    @Version
    @Column(name = "version")
    private Long version;

}
