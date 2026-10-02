package redabenssad.bnbair.listing.application.dto;

import redabenssad.bnbair.listing.application.dto.vo.PriceVO;

import java.util.UUID;

public record ListingCreateBookingDTO(
        UUID listingPublicId, PriceVO price) {
}
