package redabenssad.bnbair.listing.application.dto;

import redabenssad.bnbair.listing.application.dto.sub.PictureDTO;
import redabenssad.bnbair.listing.application.dto.vo.PriceVO;
import redabenssad.bnbair.listing.domain.BookingCategory;

import java.util.UUID;

public record DisplayCardListingDTO(PriceVO price,
                                    String location,
                                    PictureDTO cover,
                                    BookingCategory bookingCategory,
                                    UUID publicId) {
}
