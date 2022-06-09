package com.lab900.intrct.dummydata;

import com.lab900.intrct.domain.*;
import com.lab900.intrct.domain.repository.ContentRepository;
import com.lab900.intrct.domain.repository.LayerJpaRepository;
import com.lab900.intrct.domain.repository.TimelineConfigJpaRepository;
import com.lab900.intrct.domain.repository.TransistionJpaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class DummyData {
    private final LayerJpaRepository layerJpaRepository;
    private final TransistionJpaRepository transistionJpaRepository;
    private final ContentRepository contentRepository;
    private final TimelineConfigJpaRepository timelineConfigJpaRepository;


    public DummyData(LayerJpaRepository layerJpaRepository, TransistionJpaRepository transistionJpaRepository, ContentRepository contentRepository, TimelineConfigJpaRepository timelineConfigJpaRepository) {

        this.layerJpaRepository = layerJpaRepository;
        this.layerJpaRepository.deleteAll();
        this.transistionJpaRepository = transistionJpaRepository;
        this.transistionJpaRepository.deleteAll();
        this.contentRepository = contentRepository;
        this.contentRepository.deleteAll();
        this.timelineConfigJpaRepository = timelineConfigJpaRepository;
        this.timelineConfigJpaRepository.deleteAll();

        Layer mainLayer = createLayer(1L, "staticVideoLayer", 0L, 0L, 100L, 100L, "FADE-IN", "FADE-OUT");
        VideoContent videoContent = new VideoContent();
        videoContent.setLink("https://storage.googleapis.com/lab900-public-assets/background.mp4");
        videoContent.setScrollable(false);
        mainLayer.setContent(this.contentRepository.save(videoContent));
        Layer subLayer1 = createLayer(2L, "title", 2L, 2L, 2L, 2L, "NONE", "NONE");
        TextContent contentSubLayer1 = new TextContent();
        contentSubLayer1.setTextValue("Space is messy");
        subLayer1.setContent(this.contentRepository.save(contentSubLayer1));
        this.layerJpaRepository.save(subLayer1);
        Layer subLayer2 = createLayer(3L, "explanation", 2L, 10L, 2L, 10L, "NONE", "NONE");
        TextContent contentSubLayer2 = new TextContent();
        contentSubLayer2.setTextValue("Space, the final frontier, vast void speckled with planets and it's stars and well… JUNK. You see, space is messy, REALLY MESSY. But why should we care? What is space junk? Why clear space?");
        subLayer2.setContent(this.contentRepository.save(contentSubLayer2));
        this.layerJpaRepository.save(subLayer2);

        List<Layer> subLayers = new ArrayList<>();
        subLayers.add(subLayer1);
        subLayers.add(subLayer2);
        subLayer1.setSubLayers(subLayers);
        this.layerJpaRepository.save(mainLayer);

        TimelineConfig timelineConfig = new TimelineConfig();
        timelineConfig.setId(0L);
        timelineConfig.setName("cartoonBaseShowCase");
        timelineConfig.setLayers(Collections.singleton(mainLayer));

        this.timelineConfigJpaRepository.save(timelineConfig);
    }

    public Layer createLayer(long id,
                             String name,
                             long startX,
                             long startY,
                             long endX,
                             long endY,
                             String animationIn,
                             String animationOut) {
        Layer layer = new Layer();
        layer.setId(id);
        layer.setName(name);
//        layer.setContent();
        Transition transition = new Transition();
        Position startPosition = new Position();
        startPosition.setX(startX);
        startPosition.setY(startY);
        transition.setStartPosition(startPosition);

        Position endPosition = new Position();
        endPosition.setX(endX);
        endPosition.setY(endY);
        transition.setEndPosition(endPosition);
        transition.setAnimationIn(animationIn);
        transition.setAnimationOut(animationOut);

        layer.setTransition(Collections.singletonList(transition));
        return layer;
    }
}
