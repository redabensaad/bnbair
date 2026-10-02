package redabenssad.bnbair.listing.application.dto;

import redabenssad.bnbair.booking.application.dto.BookedDateDTO;
import redabenssad.bnbair.listing.application.dto.sub.ListingInfoDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;

public record SearchDTO(@Valid BookedDateDTO dates,
                        @Valid ListingInfoDTO infos,
                        @NotEmpty String location) {
}
