package br.com.jorgeacetozi.ebookChat.utils;

import br.com.jorgeacetozi.ebookChat.chatroom.domain.model.InstantMessage;
import br.com.jorgeacetozi.ebookChat.chatroom.domain.model.InstantMessageBuilder;

public class SystemMessages {
	
	public static InstantMessage welcome(String chatRoomId, String username) {
		return new InstantMessageBuilder()
				.newMessage()
				.withChatRoomId(chatRoomId)
				.systemMessage()
				.withText(username + " joined us :)");
	}

	public static InstantMessage goodbye(String chatRoomId, String username) {
		return new InstantMessageBuilder()
				.newMessage()
				.withChatRoomId(chatRoomId)
				.systemMessage()
				.withText(username + " left us :(");
	}
}
