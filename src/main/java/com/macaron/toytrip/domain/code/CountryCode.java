package com.macaron.toytrip.domain.code;

import com.macaron.toytrip.domain.common.YesNo;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CountryCode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(nullable = false)
    private String alpha3;

    @Column(nullable = false)
    private String alpha2;

    @Column(nullable = false)
    private String number3;

    @Column(nullable = false)
    private String countryName;

    @CreationTimestamp
    @Column(nullable = false)
    private OffsetDateTime createdAt;

    @Column(nullable = false)
    @Enumerated
    private YesNo useYn;

    @Builder
    public CountryCode(String alpha3, String alpha2, String number3, String countryName, YesNo useYn) {
        this.alpha3 = alpha3;
        this.alpha2 = alpha2;
        this.number3 = number3;
        this.countryName = countryName;
        this.useYn = useYn;
    }
}
