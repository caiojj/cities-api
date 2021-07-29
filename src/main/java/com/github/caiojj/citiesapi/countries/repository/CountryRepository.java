package com.github.caiojj.citiesapi.countries.repository;

import com.github.caiojj.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
