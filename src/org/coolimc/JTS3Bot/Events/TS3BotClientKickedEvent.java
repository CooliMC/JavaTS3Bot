package org.coolimc.JTS3Bot.Events;

public class TS3BotClientKickedEvent extends TS3BotClientLeaveEvent
{
	public TS3BotClientKickedEvent(TS3BotClientLeaveEvent basicEvent)
	{
		super(basicEvent);
	}
}