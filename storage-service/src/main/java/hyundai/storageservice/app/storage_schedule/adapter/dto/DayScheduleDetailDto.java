package hyundai.storageservice.app.storage_schedule.adapter.dto;

import io.swagger.v3.oas.annotations.media.Schema;

public record DayScheduleDetailDto(
        @Schema(description = "품목 명", example = "엔진 오일")
        String partName,
        @Schema(description = "입고 전체 수량", example = "50")
        int requestedQuantity,
        @Schema(description = "입고 완료한 개수", example = "30")
        int currentQuantity,
        @Schema(description = "입고 구역", example = "A구역")
        String sectionName,
        @Schema(description = "입고 위치", example = "2열 1층")
        String sectionFloor
) {
        public static DayScheduleDetailDto of(String partName,int requestedQuantity,int currentQuantity, String sectionName,String sectionFloor) {
                return new DayScheduleDetailDto(
                        partName,
                        requestedQuantity,
                        currentQuantity,
                        sectionName,
                        sectionFloor
                );
        }
}
