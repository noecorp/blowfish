package com.avantir.blowfish.messaging.respository;

import com.avantir.blowfish.messaging.model.SAPEndpoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by lekanomotayo on 01/01/2018.
 */

@Repository
@Transactional
public interface SAPEndpointRepository extends JpaRepository<SAPEndpoint, String> {

    //@Cacheable(value = "endpointById")
    SAPEndpoint findById(@Param("id") Long id);
    //@Cacheable(value = "routeByRouteId")
    SAPEndpoint findByNameAllIgnoringCase(String name);
    //@Cacheable(value = "endpointById")
    SAPEndpoint findByTcpEndpointId(@Param("tcpEndpointId") Long tcpEndpointId);


}