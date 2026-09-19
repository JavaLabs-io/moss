package main.java.io.javalabs;
import java.util.List;
import java.util.Random;

public class Main {

    private static final List<String> PROMPTS = List.of(
        """
        🌿 Look away.

        Find something green.
        Notice its shape, texture, and color.
        """,

        """
        🌿 Look outside.

        Find the farthest thing you can see.
        Spend 30 seconds looking at it.
        """,

        """
        🌿 Unclench your jaw.

        Drop your shoulders.
        Take one slow breath.
        Continue your day.
        """,

        """
        🌿 Listen.

        What is the quietest sound you can hear?
        Stay with it for 20 seconds.
        """,

        """
        🌿 Move.

        Stand up.
        Stretch your arms above your head.
        That's enough.
        """,

        """
        🌿 Notice.

        Find three things that have a similar color.
        No need to do anything with them.
        """,

        """
        🌿 Close your eyes.

        Count to ten in total darkness.
        Open them slowly.
        """,

        """
        🌿 Find shadows.

        Look around for a shadow on the wall or floor.
        Notice its shape.
        """,

        """
        🌿 Track a movement.

        Watch a cloud or a bird for 20 seconds
        without looking away.
        """,

        """
        🌿 Trace with your eyes.

        Pick any object nearby and trace its outer edge
        using only your eyes.
        """,

        """
        🌿 Check your hands.

        Clench them tightly into fists for 5 seconds.
        Let them drop completely loose.
        """,

        """
        🌿 Roll your ankles.

        Turn each foot in a slow circle five times.
        Feel the release in your legs.
        """,

        """
        🌿 Press your feet down.

        Feel the flat floor beneath your toes and heels.
        Stay there for a moment.
        """,

        """
        🌿 Feel the temperature.

        Notice the air on your skin.
        Is it cool, warm, or perfectly still?
        """,

        """
        🌿 Touch a surface.

        Run your fingers over your desk or your clothes.
        Notice the texture.
        """,

        """
        🌿 Breathe in deeply.

        Try to identify one distinct scent
        in the room around you.
        """,

        """
        🌿 Listen closer.

        Focus on the loudest sound around you,
        then find the quiet one hidden right behind it.
        """,

        """
        🌿 Check your posture.

        Are you leaning forward?
        Sit back and let the chair hold your weight.
        """,

        """
        🌿 Acknowledge a thought.

        Let whatever is on your mind pass by
        like a leaf floating down a river.
        """,

        """
        🌿 Name a comfort.

        Think of one small thing in this room
        that makes you feel safe or comfortable.
        """,

        """
        🌿 Do absolutely nothing.

        Sit completely still for exactly three
        deep, slow breaths.
        """,

        """
        🌿 Look up.

        Find the highest point in the room.
        Look at it until you take your next breath.
        """,

        """
        🌿 Check your eyes.

        Blink rapidly ten times to reset your focus.
        Then look at something far away.
        """,

        """
        🌿 Feel your pulse.

        Put a hand over your heart or on your wrist.
        Feel it beat five times.
        """,

        """
        🌿 Drop your wrists.

        Let your hands hang completely limp
        by your sides for 15 seconds.
        """,

        """
        🌿 Find symmetry.

        Look around the room for one object
        that is perfectly symmetrical.
        """,

        """
        🌿 Follow a line.

        Find a straight line in your room—
        like a shelf edge or a wall seam.
        Follow it to the end.
        """,

        """
        🌿 Notice the light.

        Where is the brightest spot of light
        in your room right now?
        Just look at it.
        """,

        """
        🌿 Soften your gaze.

        Don't focus on any single object.
        Just let your eyes rest on everything at once.
        """,

        """
        🌿 Roll your neck.

        Slowly drop your chin to your chest.
        Roll your head to one side, then the other.
        """,

        """
        🌿 Wiggle your toes.

        Do it without moving the rest of your feet.
        Notice how it feels.
        """,

        """
        🌿 Find a pattern.

        Look for a repeating pattern nearby,
        like fabric weave or wood grain.
        """,

        """
        🌿 Count things.

        Find five items in your immediate view
        that are smaller than your palm.
        """,

        """
        🌿 Feel the weight.

        Notice how heavy your phone or your arms
        feel right now.
        Let them rest.
        """
    );

    public static void main(String[] args) {
        Random random = new Random();
        String prompt = PROMPTS.get(random.nextInt(PROMPTS.size()));

        System.out.println(prompt);
    }
}