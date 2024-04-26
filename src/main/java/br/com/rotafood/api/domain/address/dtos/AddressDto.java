package br.com.rotafood.api.domain.address.dtos;

import java.util.Optional;
import java.util.UUID;


public record AddressDto (
    Optional<UUID> id,
    String country,
    String state,
    String city,
    String postalCode,
    String streetName,
    String streetNumber,
    String formattedAddress,
    CoordinateDto coordinates
) {}