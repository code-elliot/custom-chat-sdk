package chat.codebucket.in.interfaces;

import android.view.View;

import chat.codebucket.in.models.Chat;
import chat.codebucket.in.models.User;

/**
 * Created by a_man on 5/10/2017.
 */

public interface ChatItemClickListener {
    void onChatItemClick(Chat chat, int position, View userImage);

    void placeCall(boolean callIsVideo, User user);
}
