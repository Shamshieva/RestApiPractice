package com.manas.service.impl;

import com.manas.dto.convering.EntityConvertingToDto;
import com.manas.dto.request.AnnouncementRequest;
import com.manas.dto.response.SimpleResponse;
import com.manas.models.Announcement;
import com.manas.repository.AnnouncementRepository;
import com.manas.service.AnnouncementService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AnnouncementServiceImpl implements AnnouncementService {
    private final AnnouncementRepository announcementRepository;
    private final EntityConvertingToDto convertingToDto;

    public AnnouncementServiceImpl(AnnouncementRepository announcementRepository, EntityConvertingToDto convertingToDto) {
        this.announcementRepository = announcementRepository;
        this.convertingToDto = convertingToDto;
    }

    @Override
    public SimpleResponse save(AnnouncementRequest announcementRequest) {
        Announcement announcement = convertingToDto.convert(announcementRequest);
        announcementRepository.save(announcement);

       return new SimpleResponse(
               "SAVE",
               String.format("Announcement with name %s successfully saved", announcement.getTitle()));
    }
}
