package com.manas.dto.convering;

import com.manas.dto.request.AnnouncementRequest;
import com.manas.models.Announcement;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class EntityConvertingToDto implements Convert<Announcement, AnnouncementRequest> {
    @Override
    public Announcement convert(AnnouncementRequest announcementRequest) {
        Announcement announcement = new Announcement();
        announcement.setImages(announcementRequest.images());
        announcement.setTitle(announcementRequest.title());
        announcement.setAddress(announcementRequest.address());
        announcement.setCity(announcementRequest.city());
        announcement.setHouseType(announcementRequest.houseType());
        announcement.setMaxOfGuests(announcementRequest.maxOfGuests());
        announcement.setPrice(announcementRequest.price());
        announcement.setDescription(announcementRequest.description());
        announcement.setRegion(announcementRequest.region());
        announcement.setCreatedAt(LocalDate.now());

        return announcement;
    }
}
