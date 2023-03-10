package application;
//update
public class Note {
	private String name;
	private int midiNoteNumber;
	private int octave;
	private int fretnum;
	public Note(String name, int midiNoteNumber, int octave) {
		this.name = name;
		this.midiNoteNumber = midiNoteNumber;
		this.octave = octave;
		fretnum = 0;
	}
	public Note(String name, int midiNoteNumber, int octave, int fretnum) {
		this.name = name;
		this.midiNoteNumber = midiNoteNumber;
		this.octave = octave;
		this.fretnum = fretnum;
	}
	
	
	public int getFretnum() {
		return fretnum;
	}
	public void setFretnum(int fretnum) {
		this.fretnum = fretnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMidiNoteNumber() {
		return midiNoteNumber;
	}
	public void setMidiNoteNumber(int midiNoteNumber) {
		this.midiNoteNumber = midiNoteNumber;
	}
	public int getOctave() {
		return octave;
	}
	public void setOctave(int octave) {
		this.octave = octave;
	}
	public boolean equals(Note note) {
		if(name.equals(note.getName())) {
			return true;
		}
		return false;
	}
	public String toString() {
		return name;
	}
}
