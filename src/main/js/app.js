const React = require('react')
const ReactDOM = require('react-dom');
const client = require('./client');

class App extends React.Component {
	
	constructor(props) {
		super(props);
		this.state={artists: []};
	}
	
	componentDidMount() {
		client({method: 'GET', path: '/api/artists'}).done(response => {
			this.setState({artists: response.entity_embedded.artists});
		});
	}
	
	render() {
		return (
			<ArtistList artists={this.state.artists}/>
			)
	}
	
	
}

class ArtistList extends React.Component {
	render() {
		const artists= this.props.artists.map(artist =>
			<Artist key={artist._links.self.href} artist={artist}/>
	);
		return (
			<table>
				<tbody>
					<tr>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Genre Description</th>
					</tr>
					{artists}
				</tbody>
			</table>
		
		)
		
	}
}

class Artist extends React.Component{
	render() {
		return (
				<tr>
					<td>{this.props.artist.firstName}</td>
					<td>{this.props.artist.lastname}</td>
					<td>{this.props.artist.description}</td>
				</tr>
		)
	}
}

ReactDOM.render(
	<App/>,
	document.getElementById('react')
)

