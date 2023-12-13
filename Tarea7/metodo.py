from Tarea3.Cargar import cargaCifrado
from Tarea7.MetodoCarga import asignacion_alfabeto, carga_palabras_texto

cifrado = "In una vasta pianura, dove il verde si estendeva fino a perdita docchio, la natura svelava la sua magnificenza. Campi ondulanti di erba danzavano al ritmo del vento, mentre fiori colorati dipingevano il paesaggio con una tavolozza vibrante. In lontananza, una foresta rigogliosa si ergeva, le sue chiome formando un tetto verde contro il cielo azzurro. Un ruscello serpeggiava attraverso il paesaggio, il suo mormorio dolce aggiungeva una colonna sonora alla serenita del luogo. Lungo le rive del ruscello, alberi maestosi offrivano ombra agli uccelli che cantavano melodie allegre. Farfalle danzavano nell'aria, le loro ali delicate riflettevano i colori dell'arcobaleno. Il sole, nel suo splendore, gettava i suoi raggi dorati sulla terra, riscaldando il suolo e donando vita a tutte le creature che lo abitavano. Conigli curiosi uscivano dalle loro tane, esplorando l'ambiente con occhi attenti. Scoiattoli agili saltavano da ramo a ramo, accumulando ghiande per i giorni invernali. Man mano che il giorno proseguiva, il cielo si trasformava in uno spettacolo di colori durante il tramonto. Tonalita di arancione, rosa e viola dipingevano l'orizzonte, creando una scena celestiale che ispirava ammirazione. Il crepuscolo portava con se una sinfonia notturna, con grilli e rane che aggiungevano le loro voci al coro della natura. La notte scendeva sul paesaggio come un mantello scuro punteggiato da stelle scintillanti. La luna, serena nella sua bellezza argentea, illuminava dolcemente la terra. Tuttavia, l'oscurita non riduceva l'attivita notturna; al contrario, rivelava una nuova faccia della natura, con gufi che emettevano i loro richiami lontani e lucciole che punteggiavano l'oscurita con le loro luci intermittenti. Nel cuore di questa meraviglia naturale, la terra pulsava di energia vitale. Ogni creatura, ogni foglia, ogni brezza contribuiva all'armonia dell'ecosistema. Il ciclo della vita continuava, ininterrotto ed eterno, come una danza intricata in cui tutti svolgevano il proprio ruolo. Questo santuario naturale era un rifugio dal trambusto del mondo, un luogo dove il tempo sembrava rallentare e la semplicita della vita si rivelava in tutta la sua grandiosita. Era un promemoria della bellezza intrinseca della natura e dell'importanza di preservare questi tesori per le generazioni future."
historial_ingles = {}
alfabeto_ingles = "abcdefghijklmnopqrstuvwxyz"
historial_frances = {}
alfabeto_frances = "abcdefghijklmnopqrstuvwxyz"
historial_aleman = {}
alfabeto_aleman = "abcdefghijklmnopqrstuvwxyzäöüß"
historial_portugues = {}
alfabeto_portugues = "abcdefghijklmnopqrstuvwxyz"
historial_italiano = {}
alfabeto_italiano = "abcdefghijklmnopqrstuvwxyz"

# Cargamos el alfabeto en el historial para despues buscar cuantas veces se repite
# Ingles
print("ALFABETO INGLES")
historial_italiano = asignacion_alfabeto(alfabeto_italiano, historial_italiano)
print(historial_italiano)
historial_italiano = carga_palabras_texto(alfabeto_italiano, historial_italiano, cifrado)
print(historial_italiano)


