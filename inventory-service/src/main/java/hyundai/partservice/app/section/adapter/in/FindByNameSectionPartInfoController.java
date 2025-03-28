package hyundai.partservice.app.section.adapter.in;


import hyundai.partservice.app.section.adapter.dto.SectionPartInventoryResponse;
import hyundai.partservice.app.section.application.port.in.FindByNameSectionPartInfoUseCase;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Tag(
        name = "부품 섹션 API",
        description = "부품 섹션의 다양한 정보를 조회"
)
public class FindByNameSectionPartInfoController {

    private final FindByNameSectionPartInfoUseCase findByNameSectionPartInfoUseCase;

    @Operation(
            summary = "섹션별 부품 정보 조회",
            description = "특정 섹션 이름을 기반으로 부품 정보를 조회합니다."
    )
    @GetMapping("/parts/section/name/info")
    public SectionPartInventoryResponse getSectionPartInfo(
            @Parameter(description = "조회할 섹션 이름", example = "엔진룸")
            @RequestParam String name) {
        return findByNameSectionPartInfoUseCase.findByNameSectionPartInfo(name);
    }
}
