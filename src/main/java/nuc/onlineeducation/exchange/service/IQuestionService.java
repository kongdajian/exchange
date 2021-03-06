package nuc.onlineeducation.exchange.service;

import com.github.pagehelper.PageInfo;
import nuc.onlineeducation.exchange.common.ServerResponse;
import nuc.onlineeducation.exchange.model.Question;
import nuc.onlineeducation.exchange.vo.QuestionDetailVO;
import nuc.onlineeducation.exchange.vo.QuestionVO;

/**
 * @author Ji YongGuang.
 * @date 0:07 2018/1/8.
 */
public interface IQuestionService {

    ServerResponse<Integer> saveQuestion(Question question);

    ServerResponse<PageInfo> getLatestQuestions(Integer userId, Integer pageNum, Integer pageSize);

    ServerResponse<QuestionDetailVO> getQuestionDetail(Integer questionId);

    ServerResponse updateCommentCount(Integer entityId, Integer count);

    ServerResponse removeQuestionById(Integer questionId);

    ServerResponse updateQuestion(Question question);

    ServerResponse<PageInfo> getQuestions(Integer pageNum, Integer pageSize);

    ServerResponse<QuestionVO> getQuestionById(Integer questionId);
}
