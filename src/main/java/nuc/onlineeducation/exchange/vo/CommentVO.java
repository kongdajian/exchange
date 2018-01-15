package nuc.onlineeducation.exchange.vo;

import lombok.*;

/**
 * @author Ji YongGuang.
 * @date 14:42 2018/1/11.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CommentVO {

    private Integer id;

    private Integer userId;

    private Integer entityId;

    private Integer entityType;

    private Integer status;

    private String createTime;

    private String updateTime;

    private String content;

    private String username;

    private String headUrl;

    private String introduce;
    // 用户对该评论的feel
    private Integer liked;
    // 该评论被喜欢的数量
    private Long likeCount;
}
