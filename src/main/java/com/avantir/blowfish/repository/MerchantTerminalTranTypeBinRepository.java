package com.avantir.blowfish.repository;

import com.avantir.blowfish.entity.MerchantTerminalTranTypeBin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Created by lekanomotayo on 01/01/2018.
 */

@Repository
@Transactional
public interface MerchantTerminalTranTypeBinRepository extends JpaRepository<MerchantTerminalTranTypeBin, Long> {

    @Query("FROM MerchantTerminalTranTypeBin m WHERE m.merchantTerminalTranTypeBinId = :merchantTerminalTranTypeBinId")
    Optional<MerchantTerminalTranTypeBin> findByMerchantTerminalTranTypeBinId(@Param("merchantTerminalTranTypeBinId") Long merchantTerminalTranTypeBinId);
    Optional<List<MerchantTerminalTranTypeBin>> findByMerchantId(@Param("merchantId") Long merchantId);
    Optional<List<MerchantTerminalTranTypeBin>>  findByTerminalId(@Param("terminalId") Long terminalId);
    Optional<List<MerchantTerminalTranTypeBin>>  findByTranTypeId(@Param("tranTypeId") Long tranTypeId);
    Optional<List<MerchantTerminalTranTypeBin>> findByBinId(@Param("binId") Long binId);
    @Query("FROM MerchantTerminalTranTypeBin m WHERE m.merchantId = :merchantId AND m.terminalId = :terminalId AND m.tranTypeId = :tranTypeId AND m.binId = :binId")
    Optional<MerchantTerminalTranTypeBin> findByMerchantIdTerminalIdTranTypeIdBinId(@Param("merchantId") Long merchantId, @Param("terminalId") Long terminalId, @Param("tranTypeId") Long tranTypeId, @Param("binId") Long binId);

}
