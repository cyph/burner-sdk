declare module '@cyph/burner-sdk' {
	interface ICyphBurnerSDK {
		/** Optional features that can be activated when initiating a session. */
		options: {
			disableP2P: number;
			modestBranding: number;
			telehealth: number;
			video: number;
			voice: number;
		};

		/**
		 * Starts a new Cyph Burner session.
		 * @param apiKey API key
		 * @param options List of values from ICyphBurnerSDK.options
		 * @param services Configuration to override default Cyph environment (example in readme)
		 * @returns Promise resolving to the link to the session
		 */
		initiateSession (
			apiKey: string,
			options?: number[],
			services?: {
				backend?: string;
				chat: string;
				telehealth?: string;
				video?: string;
				voice?: string;
			}
		) : Promise<string>;
	}

	const cyph: ICyphBurnerSDK;
}
