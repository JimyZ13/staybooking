package com.laioffer.staybooking.repository;

import com.laioffer.staybooking.model.Stay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laioffer.staybooking.model.User;
import java.util.List;

@Repository
public interface StayRepository extends JpaRepository<Stay, Long> {
    List<Stay> findByHost(User user);

    Stay findByIdAndHost(Long id, User host);
}
