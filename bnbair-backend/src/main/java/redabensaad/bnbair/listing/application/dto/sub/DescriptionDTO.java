package redabenssad.bnbair.listing.application.dto.sub;

import redabenssad.bnbair.listing.application.dto.vo.DescriptionVO;
import redabenssad.bnbair.listing.application.dto.vo.TitleVO;
import jakarta.validation.constraints.NotNull;

public record DescriptionDTO(
        @NotNull TitleVO title,
        @NotNull DescriptionVO description
        ) {
}
