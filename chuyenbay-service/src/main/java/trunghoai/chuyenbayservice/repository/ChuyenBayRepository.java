package trunghoai.chuyenbayservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import trunghoai.chuyenbayservice.entity.ChuyenBay;

@Repository
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String> {
    @Query(nativeQuery = true, value = "select * from chuyenbay where macb = :machuyenbay")
    public ChuyenBay findByMa(@Param("machuyenbay") String machuyenbay);
}
