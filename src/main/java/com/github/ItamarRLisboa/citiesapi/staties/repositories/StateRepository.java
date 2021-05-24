package com.github.ItamarRLisboa.citiesapi.staties.repositories;

import com.github.ItamarRLisboa.citiesapi.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
