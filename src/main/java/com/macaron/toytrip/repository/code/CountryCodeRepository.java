package com.macaron.toytrip.repository.code;

import com.macaron.toytrip.domain.code.CountryCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryCodeRepository extends JpaRepository<CountryCode, Integer> {
}
